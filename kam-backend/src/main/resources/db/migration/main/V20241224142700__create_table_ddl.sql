-- Create KAM table
CREATE TABLE kam (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(255),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    joined_date DATE
);

-- Create Restaurant table
CREATE TABLE restaurant (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address TEXT,
    status VARCHAR(50),
    kam_id INT,
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    call_frequency INT DEFAULT 0,
    last_call_date DATE,
    CONSTRAINT fk_kam FOREIGN KEY (kam_id) REFERENCES kam(id) ON DELETE SET NULL
);

-- Create POC table (Point of Contact)
CREATE TABLE poc (
    id SERIAL PRIMARY KEY,
    restaurant_id INT,
    name VARCHAR(255),
    role VARCHAR(100),
    email VARCHAR(255),
    phone VARCHAR(255),
    is_primary BOOLEAN DEFAULT FALSE,
    CONSTRAINT fk_restaurant FOREIGN KEY (restaurant_id) REFERENCES restaurant(id) ON DELETE CASCADE
);

-- Create Interaction table
CREATE TABLE interaction (
    id SERIAL PRIMARY KEY,
    restaurant_id INT,
    type VARCHAR(100),
    details TEXT,
    interaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    kam_id INT,
    CONSTRAINT fk_interaction_restaurant FOREIGN KEY (restaurant_id) REFERENCES restaurant(id) ON DELETE CASCADE,
    CONSTRAINT fk_interaction_kam FOREIGN KEY (kam_id) REFERENCES kam(id) ON DELETE CASCADE
);

-- Create Order table
CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    restaurant_id INT,
    amount DECIMAL(10, 2),
    status VARCHAR(50),
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_order_restaurant FOREIGN KEY (restaurant_id) REFERENCES restaurant(id) ON DELETE CASCADE
);

-- Alter Restaurant table to add performance metrics columns
ALTER TABLE restaurant
ADD COLUMN total_order INT DEFAULT 0,
ADD COLUMN total_revenue DECIMAL(10, 2) DEFAULT 0.00,
ADD COLUMN last_interacted TIMESTAMP;
