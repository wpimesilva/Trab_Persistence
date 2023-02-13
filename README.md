# Trab_Persistence

O sistema foi feito com base no Lab 05, Cache + Redis. Escolhi fazer dessa forma pois se assemelha bastante com alguns conceitos que utilizo no .NET, e como apanho bastante ainda em JAVA, resolvi escolher esse.

Foram criados 4 tabelas, conforme imagem abaixo do MER. 

A tabela tb_clientes tem uma relação um para n com a tabela tb_pedidos, já que um Cliente pode ter vários pedidos. Para isso foi utilizado a annotation @OneToMany na classe Cliente para listar todos os pedidos dele. E para registrar o cliente do pedido foi utilizado a annotation @ManyToOne na entidade Pedido.

![image](https://user-images.githubusercontent.com/109322283/218355052-7f04a6ab-270f-4d6d-8c95-b59697b5e37a.png)

MER

No projeto foram criados 3 entidades, controllers e services, assim como o CRUD. Como informado anteriormente, foi baseado no Lab 05

O cadastro deverá ser feito pelo usuário:

1 - Produto em /api/cadastro/produto
2 - Cliente em /api/cadastro/cliente
3 - Pedido em /api/cadastro/cliente/{idCliente}/pedido
4 - Itens em um pedido em /api/cadastro/pedido/{idPedido}/item
