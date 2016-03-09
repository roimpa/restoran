-- Table: public.plato

-- DROP TABLE public.plato;

CREATE TABLE public.plato
(
  id_plato integer NOT NULL,
  descripcion text,
  CONSTRAINT plato_pkey PRIMARY KEY (id_plato)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.plato
  OWNER TO postgres;
