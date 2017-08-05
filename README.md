Introduction
=================
I will be trying to create a system that will immitates a commerical shop; I will at this moment in time be aiming to have four services. The Shop, Warehouse, WebService and DeliveryService.

The first phase will be to introduce the shop and warehouse implementation.
- The shop implemenation will be simulating a physical shop; it will have it's own independent stock. People can browse items, buy items and return items.
- Warehouse will give shops the ability to request new/more stock and it will act as a mediator to suppliers.

The second phase will be to introduce the online service; this will have an impact on the Shop and Warehouse indirectly. As part of the online service we will need to introduce a delivery service.
- Customers can now view Shop stock from online and reserve items.
- Customers can now order items online; the products will come directly from the warehouse through a delivery service.

- OnlineService will handle the requests for reserving and ordering items.
- DeliveryService will be delegating the deliveries between internal or external delivery drivers.

Extra: Third phase (if I get around to it); is to produce a GUI to represent OnlineService and/or to create a simulation of the whole system.

I will tidy up when necessary; providing more details/ requirements. I have produced a very basic diagram of my solution (subject to change).

![Plan Of Project](/readme/images/plan.png?raw=true "Optional Title")
