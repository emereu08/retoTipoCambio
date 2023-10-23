CREATE TABLE tipocambio(
    id INT AUTO_INCREMENT PRIMARY KEY,
    moneda_origen char(3) NOT NULL,
    moneda_destino char(3) NOT NULL,
    tipo_cambio DOUBLE NOT NULL
);

create table cambio (
    id_cambio INT AUTO_INCREMENT PRIMARY KEY,
    moneda_destino varchar(255),
    moneda_origen varchar(255),
    monto_destino double,
    monto_origen double,
    tipo_cambio double);