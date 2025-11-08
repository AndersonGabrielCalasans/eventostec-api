-- Migration V2: cria tabelas address, coupon e MyEntity e as chaves estrangeiras

CREATE TABLE IF NOT EXISTS address (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    city VARCHAR(255),
    uf VARCHAR(255),
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS coupon (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    discount INTEGER,
    valid TIMESTAMP,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);