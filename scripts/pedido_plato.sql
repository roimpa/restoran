-- Table: public.pedido_plato

-- DROP TABLE public.pedido_plato;

CREATE TABLE public.pedido_plato
(
  id_pedido integer NOT NULL,
  id_plato integer NOT NULL,
  CONSTRAINT pedido_plato_id_pedido_fkey FOREIGN KEY (id_pedido)
      REFERENCES public.pedido (id_pedido) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT pedido_plato_id_plato_fkey FOREIGN KEY (id_plato)
      REFERENCES public.plato (id_plato) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.pedido_plato
  OWNER TO postgres;
