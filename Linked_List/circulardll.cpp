#include<iostream>
using namespace std;
class Node
{
    public: int value;
            Node *prev;
            Node *next;
            Node(int data)
            {
                value=data;
                prev=NULL;
                next=NULL;
            }
};
class CDLL
{
    Node *head=NULL;
    Node *last=NULL;
    public:
            void insert_at_last(int data)
            {
                  Node* temp=new Node(data);
                  Node* t1=head;
                  if(head==NULL)
                  {
                    head=temp;
                    last=temp;
                  }  
                  else
                  {
                    while(t1->next!=NULL)
                    {
                        t1=t1->next;
                    }
                    t1->next=temp;
                    temp->prev=t1;
                    last=temp;
                    last->next=head;
                    head->prev=last;
                  }
            }
            void insert_at_begin(int data)
            {
                Node * temp=new Node(data);
                if(head==NULL)
                  { head=temp;
                    last=temp;
                  } 
                else
                {
                    temp->next=head;
                    head->prev=temp;
                    head=temp;
                    head->prev=last;
                    last->next=head;
                }
            }
            void insert_at_middle(int data,int position)
            {
                Node *temp =new Node(data);
                Node *ptr=head;
                Node *prev=NULL;
                while(ptr!=NULL&&ptr->value!=position)
                {
                    prev=ptr;
                    ptr=ptr->next;
                }
                if(ptr==NULL)
                    cout<<"Invalid position";
                else
                {
                    prev->next=temp;
                    temp->next=ptr;
                    ptr->prev=temp;
                }        
            }
            void display()
            {
                Node *ptr=head;
                while(ptr!=NULL)
                {
                    cout<<ptr->value<<"-><-";
                    ptr=ptr->next;
                }
            }
            void delete_at_first()
            {
                Node *ptr=head;
                if(head==NULL)
                    cout<<"DLL is empty";
                else
                {
                    head=ptr->next;
                    head->prev=last;
                    last->next=head;
                    delete ptr;
                }
               
            }
            void delete_at_last()
            {
                Node *ptr=head;
                if(head==NULL)
                    cout<<"DLL is empty";
                else
                {
                    while(ptr->next->next!=head)
                    {
                        ptr=ptr->next;
                    }
                    last=ptr;
                    last->next=head;
                    head->prev=last;
                    display();
                }
            }
            void delete_at_middle(int data)
            {
                Node* ptr=head;
                Node* prev1=NULL;
                Node* fwd=ptr->next;
                if(head==NULL)
                    cout<<"DLL is empty";
                else
                {
                    while(ptr->value!=data)
                    {
                        prev1=ptr;
                        ptr=ptr->next;
                        fwd=fwd->next;
                    }
                    prev1->next=ptr->next;
                    fwd->prev=prev1;
                }
            }
};
int main()
{
    int num,choice,ch,position;
    cout<<"Created empty circular double linked list"<<endl;
    CDLL d1;
    do
    {
        cout<<"Operation List"<<endl;
        cout<<"1.Insert at end"<<endl;
        cout<<"2.Insert at Begining"<<endl;
        cout<<"3.Insert at Middle"<<endl;
        cout<<"4.Display"<<endl;
        cout<<"5.Delete_at_first"<<endl;
        cout<<"6.Delete_at_last"<<endl;
        cout<<"7.Delete_at_middle"<<endl;
        cout<<"Select the operations=>";
        cin>>choice;
        switch(choice)
        {
            case 1:cout<<"Enter the number to insert=>";
                   cin>>num;
                   d1.insert_at_last(num);
                   d1.display();
                   break;
            case 2:cout<<"Enter the number to insert=>";
                   cin>>num;
                   d1.insert_at_begin(num);
                   d1.display();
                   break;
            case 3:cout<<"Enter the number to insert=>";
                   cin>>num;
                   cout<<"Enter the position=>";
                   cin>>position;
                   d1.insert_at_middle(num,position);
                   d1.display();
                   break;
            case 4:d1.display();
                    break;
            case 5:d1.delete_at_first();
                   d1.display();
                   break;
            case 6:d1.delete_at_last();
                   break;
            case 7:cout<<"Select the node to delete=>";
                   cin>>num;
                   d1.delete_at_middle(num);
                   d1.display();
                   break;
            default:cout<<"Invalid operation"<<endl;
                    break;
        }
        cout<<endl;
        cout<<"Do you want to continue then press 1 otherwise 0:=>";
        cin>>ch;
    } while (ch!=0);
    return 0;
}