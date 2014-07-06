public class link {
    public int data;
    public String name;
    public link next;
    
    public link(int data, String name){
        this.data=data;
        this.name=name;
    }
    
    public void display(){
        System.out.println("Data :"+data +" Name: " + name);
    }
    
    public String toString(){
       return name;
    }
    
    public static void main(String []args){
        System.out.println("MY LINK LIST Program");
        
        linkList thelinkList =new linkList();
        thelinkList.insertFirstLink(1, "A" );
        thelinkList.insertFirstLink(2, "B" );
        thelinkList.insertFirstLink(3, "C" );
        thelinkList.display();
        link remove; 
        remove=thelinkList.removeFirst();
        System.out.println("Reoved First link :" + remove +"\n");
        thelinkList.display();
        thelinkList.insertFirstLink(3, "C" );
        thelinkList.insertFirstLink(4, "D" );
        link found;
        found=thelinkList.find("B");
        System.out.println("Found link : " + found );
        link notfound;
        notfound=thelinkList.find("E");
        System.out.println("Found link : " + notfound );
    }
    
    
}   


class linkList{
    public link firstLink;
    
    linkList(){
        firstLink=null;
    }
    
    public boolean isEmpty(){
        return (firstLink==null);
    }
    
    public void  insertFirstLink(int data,String name){
        link newLink =new link(data, name);
        newLink.next=firstLink;
        firstLink=newLink;
    }
    
    public link removeFirst(){
        link linkReference =firstLink;
        
        if(!isEmpty()){
            firstLink=firstLink.next;
        } else {
            System.out.println("Empty LinkList");
        }
        
       return linkReference; 
    }
    
    public void display(){
        link theLink= firstLink;
        
        while(theLink!=null){
            theLink.display();
            System.out.println("Next Link: "+theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }
    
    public link find(String name){
        link theLink=firstLink;
        
        if(!isEmpty()){
            while(theLink.name !=name){
                if(theLink.next ==null){
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("Empty Link List");
        }
        
        return theLink;
    }
    
    public link removeLink(String name){
        link currentLink = firstLink;
        link previousLink = firstLink;
        
        while (currentLink.name!=name){
            if(currentLink.next==null){
                return null;
            } else {
                previousLink =currentLink;
                currentLink = currentLink.next;
            }
        }
        if(currentLink ==firstLink){
            firstLink =firstLink.next;
        } else {
            previousLink.next =currentLink.next;
            
        }
        
        return currentLink;
    }
    
    
}



