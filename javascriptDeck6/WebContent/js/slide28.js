/**
 * 
 */
/*
var Linkedlist = function(){
    this.head= null;
    this.size=0;
    this.addToTail = function(v){
        var node = new Node(v);
        if(this.head===null){
            this.head = node;
            this.size++;
            return;
        }
        var current = this.head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        this.size++;
    }
}
var Node = function(v) {
    this.value = v;
    this.next = null;
}*/

console.log("\n\n\n *********** Slide 34**************");
var Linkedlist = function(){
    this.head= null;//this list is empty
    this.size=0;
    this.addToHead = function(v){
         var node = new Node(v);
        if(this.head===null){//if the list is empty
            this.head = node;
            this.size++;
           
        }else { //if the list contains one for more nodes
            node.next = this.head;
            this.head = node;
            this.size++;
        }
         return;
    }
}

var Node = function(v){
    this.value = v;
    this.next = null;
}

var booksNumber = new Linkedlist();
    booksNumber.addToHead(10);
    booksNumber.addToHead(20);
    booksNumber.addToHead(30);
    booksNumber.addToHead(40);

    console.log(booksNumber);


    console.log("\n\n\n *********** Slide 35**************");
var Linkedlist = function(){
    this.head= null;//this list is empty
    this.size=0;
    this.addToHead = function(v){
         var node = new Node(v);
        if(this.head===null){//if the list is empty
            this.head = node;
            this.size++;
           
           
        } else { //if the list containes one or more nodes
            node.next=this.head.next;
            this.head.next = node;
        }
    }
}

        var Node = function(v){
            this.value = v;
            this.next = null;
        }


    var Node = function(v){
        this.value = v;
        this.next = null;
    }

    var booksNumber = new Linkedlist();
        booksNumber.addToHead(10);
        booksNumber.addToHead(20);
        booksNumber.addToHead(30);
        booksNumber.addToHead(40);

    console.log(booksNumber);
