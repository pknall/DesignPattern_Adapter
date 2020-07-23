Adapter Pattern
===
This application shows an example of an Adapter Pattern.  A full description of this pattern can be
found at https://www.youtube.com/watch?v=2PKQtcJjYvc.

In this application, the Client Application wants to use the Adaptee class but must use the 
ITarget interface.  The Adapter class acts as a go-between between these two classes by extending
the Adaptee class and implementing the ITarget interface.  Through the Adapter class, the 
Client Application can continue to call the request() method it expects and the Adapter class
takes care of the details.

Note:  The Adaptee interface may not be instantiatable if it has static methods (24:00).

Static methods are used here without a problem?