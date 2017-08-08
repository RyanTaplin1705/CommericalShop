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

Service 1 - Shop
=================

~~Q 08/08/17~~
Not yet sure how I will deal with receipts and transactions in tills.
Customer can fill ~~basket~~, go to ~~checkout~~, ~~transaction~~ is made, ~~receipt~~ is printed.

Q 08/08/17
Want to break up Till; not sure if I should create one big generic method with checkOut(Basket b) and break this down into more smaller methods i.e addItem(a). I don't want this to be a big clump; how about if a customer decided to remove an item afterwards? How down I cater for this use in my design?

Shop
---------------
Fields
- List[Staff] staff
- List[Till] tills
- StockRepo Stock

Methods
- shopOpen()
- shopClose
- hire(Person p)

Staff
---------------
Fields
- Role role

Methods
- fire()
- review()
- promote(Role r)

Basket
---------------
Fields
- List[Item] items

Methods
- add(Item i)
- remove(Item i)

Till
---------------
Fields
- int uniqueId
- double cash
- ItemInventory inventory
- TransactionServer server
- Transaction currentTransaction
- TillSession loginSession

Methods
- checkOut(Basket b)
- pay(Payment p) // once complete transaction is sent to TransactionServer and receipt is printed
- withdrawItem(Item i)
- withdrawItem(Item i, Quantity)
- restockMoney(int amount) //rename more appropriately
- emptyMoney() //rename more appropriately
- signIn(Staff s)
- logOut()

TillSession
------------
Fields
- int staffId

Methods
- terminateSession()


Transaction
---------------
Fields
- List[Item] items
- Payment p

Methods
- createReceipt()

TransactionServer
---------------
(use event sourcing??)

Fields
- List[Transaction] transactions;

Methods
- add(Transaction t)
- update(Transaction t)

StockRepo
---------------
Fields
- List[Item, Quantity] items

Method
- restock(Item i)
- deprecate(Item i) no longer restocks/supplies item
- count(Item i)

Item Abstract Impl
---------------
Fields
- Price

Method
- buy()
- return()
- replace()
- update()

E.g. ItemType Clothes 
--------------------
Fields
- size

Database
--------
Tables
- Staff && Staff Credentials
- StockInventory

Require **new** service TransactionServer with a database table that stores and manages all transactions.
