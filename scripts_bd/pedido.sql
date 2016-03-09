-- Table: public.pedido

-- DROP TABLE public.pedido;

CREATE TABLE public.pedido
(
  id_pedido integer NOT NULL,
  cod_mesa integer,
  CONSTRAINT pedido_pkey PRIMARY KEY (id_pedido)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.pedido
  OWNER TO postgres;
