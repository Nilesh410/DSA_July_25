#include<iostream>
using namespace std;
class node
{
public: int data;
        node *next;
        node()
        {
            next=NULL;
        }
};
class Linked_List
{
    node  *head;
    public: Linked_List()
            {
                head=NULL;
            }
            void insert_at_begin(int value)
            {
                node *temp=new node();
                temp->data=value;
                temp->next=head;
                head=temp;
            }
            void display()
            {
                if(head==NULL)
                    cout<<"Linked List is empty";
                node *temp=head;
                while(temp!=NULL)
                {
                    cout<<temp->data<<"->";
                    temp=temp->next;
                }
                cout<<endl;
            }
            void insert_at_last(int value)
            {
                node *temp=head;
                node *prev=head;
                while(temp->next!=NULL)
                {
                   // prev=temp;
                    temp=temp->next;
                }
                node *temp1=new node();
                temp1->data=value;
                temp->next=temp1;
            }
            void insert_at_middle(int value,int position)
            {
                node *temp=head;
                node *prev=head;
                while(temp->data!=position)
                {
                    prev=temp;
                    temp=temp->next;
                }
                node *node1=new node();
                node1->data=value;
                node1->next=temp;
                prev->next=node1;
            }
            void delete_first()
            {
                node * temp=head;
                if(head==NULL)
                    cout<<"Linked List is empty";
                 head=temp->next;
                 delete temp;
            }
            void delete_last()
            {
                node * temp=head;
                if(head==NULL)
                    cout<<"Linked List is empty";
                while(temp->next->next!=NULL)
                {
                    temp=temp->next;
                }
                 temp->next=NULL;
            }
            void delete_at_anywhere(int num)
            {
                if(head==NULL)
                {
                    cout<<"Linked list is empty";
                    return;
                }
                node *temp=head;
                node *prev=NULL;
                while(temp!=NULL&&temp->data!=num)
                {
                    prev=temp;
                    temp=temp->next;
                }
                if(temp==NULL)
                {
                     cout<<"No is not found in the list";
                     return;
                }
                if(prev==NULL)
                {
                    head=head->next;
                    delete temp;
                    return;
                }
                prev->next=temp->next;
                delete temp;
            }
            void search(int search_ele)
            {

            }
};
int main()
{
    cout<<"Creat a linked:";
    Linked_List l1;
    int choice,num,position,ch;
    do{
        cout<<"Select the operation:"<<endl;
        cout<<"1.Insert at Begin"<<endl;
        cout<<"2.Insert at last"<<endl;
        cout<<"3.Insert at middle"<<endl;
        cout<<"4.Delete at begin"<<endl;
        cout<<"5.Delete at last"<<endl;
        cout<<"6.Delete any where"<<endl;
        cout<<"7.Display"<<endl;
        cin>>choice;
        switch(choice)
        {
            case 1: cout<<"enter the element to insert at begin:";
                    cin>>num;
                    l1.insert_at_begin(num);
                    l1.display();
                    break;
            case 2:cout<<"enter the element to insert at last:";
                    cin>>num;
                    l1.insert_at_last(num);
                    l1.display();
                    break;
            case 3: cout<<"select the positon:";
                    cin>>position;
                    cout<<"enter the element to insert at position:";
                    cin>>num;
                    l1.insert_at_middle(num,position);
                    l1.display();
                    break;
            case 4:l1.delete_first();
                    l1.display();
                    break;
            case 5:l1.delete_last();
                    l1.display();
                    break;
            case 6: cout<<"enter the ele to delete:";
                    cin>>num;
                    l1.delete_at_anywhere(num);
                    l1.display();
                    break;
            case 7:l1.display();
                    break;
            default:cout<<"Please select the valid case:";   
                    break;
        }
        
        cout<<"If you want to continue then press 1 otherwise 0";
        cin>>ch;
    }while(ch!=0);
    return 0;
}