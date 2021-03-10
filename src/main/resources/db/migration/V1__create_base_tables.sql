CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS challenge(
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    title varchar NOT NULL,
    description varchar NOT NULL,
    created_at TIMESTAMP DEFAULT current_timestamp,
    updated_at TIMESTAMP DEFAULT current_timestamp
);