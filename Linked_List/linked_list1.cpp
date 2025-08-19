#include<iostream>
using namespace std;

class Node 
{
    public:int data;
           Node *next;
           Node()
           {
              next=NULL;
           }
};
class Linked_List
{
   Node *head;
   public:
            Linked_List()
            {
                head=NULL;
            }
            void insert_at_first(int num)
            {
                Node *temp=new Node();
                temp->data=num;
                temp->next=head;
                head=temp;    
            }
            void insert_at_last(int num)
            {
                Node *ptr=head;
                Node *temp=new Node();
                temp->data=num;
                if(head==NULL)
                {
                    head=temp;
                }
                else
                {
                    while(ptr->next!=NULL)
                    {
                        ptr=ptr->next;
                    }
                    ptr->next=temp;
                }
            }
            void add_anywhere(int num,int post)
            {
                Node *next1,*prev;
                next1=head;
                prev=NULL;
                while(next1->data!=post)
                {
                    prev=next1;
                    next1=next1->next;
                }
                Node *temp=new Node();
                temp->data=num;
                temp->next=next1;
                prev->next=temp;
            }
            void delete_fist_node()
            {
                Node *temp=head;
                if(head==NULL)
                    cout<<"Linked list is empty";
                else
                {
                    head=temp->next;
                    delete temp;
                    display();
                }
            }
            void delete_last_node()
            {
                Node *temp=head;
                if(head==NULL)
                    cout<<"Linked list is empty";
                else
                {
                    while(temp->next->next!=NULL)
                    {
                        temp=temp->next;
                    }
                    temp->next=NULL;
                    display();
                }
            }
            void delete_any_node(int num)
            {
                Node *temp=head;
                Node *prev=NULL;
                if(head==NULL)
                    cout<<"Linked list is empty";
                else
                {
                    while(temp->data!=num&&temp!=NULL)
                    {
                        prev=temp;
                        temp=temp->next;
                    }
                    if(temp==NULL)
                        cout<<"Node is not present in the linked list"<<endl;
                    else
                    {
                        prev->next=temp->next;
                        delete temp;
                        display();
                    }
                }

            }
            void search(int num)
            {
                Node *temp=head;
                while(temp->data!=num&&temp!=NULL)
                {
                    temp=temp->next;
                }
                if(temp==NULL)
                    cout<<"Data is not present in linked list";
                else
                    cout<<"Data is present in the linked list";
            }
            void display()
            {
                Node *temp;
                if(head==NULL)
                    cout<<"Linked list is empty";
                else
                {
                    temp=head;
                    while(temp!=NULL)
                    {
                        cout<<temp->data<<"=>";
                        temp=temp->next;
                    }
                    cout<<endl;
                }
            }
};
int main()
{
    cout<<"Here we created empty linked list=>"<<endl;
    Linked_List l1;
    int choice,ch,num,post;
    do{
        cout<<"Select the operation to perform on linked list=>"<<endl;
        cout<<"1.Insert at Begining"<<endl;
        cout<<"2.Insert at Last"<<endl;
        cout<<"3.Insert at Anywhere"<<endl;
        cout<<"4.Delete First Node"<<endl;
        cout<<"5.Delete Last Node"<<endl;
        cout<<"6.Delete Any Node"<<endl;
        cout<<"7.Display Linked List"<<endl;
        cout<<"8.Search a node"<<endl;
        cout<<"Choice=>";
        cin>>choice;
        switch(choice)
        {
            case 1:cout<<"Enter the number to insert=";
                   cin>>num;
                   l1.insert_at_first(num);
                   l1.display();
                   break;
            case 2:cout<<"Enter the number to insert=";
                    cin>>num;
                    l1.insert_at_last(num);
                    l1.display();
                    break;
            case 3:cout<<"Enter the number=";
                   cin>>num;
                   cout<<endl;
                   cout<<"Select the position=";
                   cin>>post;
                   l1.add_anywhere(num,post);
                   l1.display();
                   break;
            case 4:l1.delete_fist_node();
                    break;
            case 5:l1.delete_last_node();
                    break;
            case 6:cout<<"Enter the node value to delete";
                    cin>>num;
                    l1.delete_any_node(num);
                    break;
            case 7:l1.display();
                    break;
            case 8:cout<<"Enter the num to search=";
                   cin>>num;
                   l1.search(num);
                   break;
            default:cout<<"Invalid choice";
                    break;
        }
        cout<<"If you want to continue then press 1 otherwise 0:";
        cin>>ch;
    }while(ch!=0);
    return 0;
}