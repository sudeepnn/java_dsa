
public class ll {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node curt=head;
        while(curt.next!=null){
            curt=curt.next;
        }
        curt.next=newnode;
    }

    public void delFirst(){
        if(head==null)
        System.out.println("List is empty");
        else{
            head=head.next;
        }
    }
    public void delLast(){
          if(head==null)
        System.out.println("List is empty");
        if(head.next==null){
            head=null;
            return;
        }
        else{
            Node secondlast=head;
            Node last=head.next;
            while(last.next!=null){
                last=last.next;
                secondlast=secondlast.next;
            }
            secondlast.next=null;
        }
    }

    public void printlist(){
        if(head==null){
            System.out.println("No list");
        }
        else{
            Node curt=head;
            while(curt!=null){
                System.out.print(curt.data+"-->");
                curt=curt.next;
            }
        }
    }
    public static void main(String[] args) {
        ll list=new ll();
        list.addFirst("Sudeep");
        list.addFirst("Im");
        list.addLast("Naik");
        list.printlist();
        list.delFirst();
        System.out.println();
        list.printlist();
        list.delLast();
        System.out.println();
        list.printlist();
    }
    
}
