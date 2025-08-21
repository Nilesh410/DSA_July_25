#include<iostream>
using namespace std;
class Queue
{
    private: int front;
             int rear;
             int arr[5];
    public: Queue()
            {
                front=rear=-1;
            }
            bool isEmpty()
            {
                if(front==-1 && rear==-1)
                    return true;
                else 
                    return false;
            }
            bool isFull()
            {
                int size=sizeof(arr)/sizeof(arr[0]);
                if(rear==size-1)
                    return true;
                else 
                    return false;
            }
            void enque(int data)
            {
                if(isFull())
                    cout<<"Queue is full";
                else 
                {
                    if(isEmpty())
                    {
                        front=rear=0;
                    }
                    else
                    {
                        rear++;
                    }
                    arr[rear]=data;
                }
            }
            void deque()
            {
                if(isEmpty())
                    cout<<"Queue is empty";
                else
                {
                    cout<<"Deque:"<<arr[front]<<endl;
                    if(front==rear)
                    {
                        front=rear=-1;
                    }
                    else
                    {
                        front++;
                    }
                    
                }
            }
            void display()
            {
                for(int i=front;i<=rear;i++)
                {
                    cout<<arr[i]<<" ";
                }
                cout<<endl;
            }
};
int main()
{
    Queue q;
    q.enque(12);
    q.enque(7);
    q.enque(34);
    q.enque(52);
    q.enque(46);
    q.enque(23);
    q.display();
    q.enque(78);
    q.deque();
    q.deque();
    q.display();
    q.enque(34);
    return 0;
}