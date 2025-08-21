#include<iostream>
using namespace std;
class circular_queue
{
    private: int front,rear;
            int arr[5];
    public:circular_queue()
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
                if(front==(rear+1)%size)
                    return true;
                else 
                    return false;
            }
            void enque(int data)
            {
                int size=sizeof(arr)/sizeof(arr[0]);
                if(isFull())
                    cout<<"Queue is full"<<endl;
                else 
                {
                    if(isEmpty())
                    {
                        front=rear=0;
                    }
                    else
                    {
                        rear=(rear+1)%size;
                    }
                    arr[rear]=data;
                }
            }
            void deque()
            {
                int size=sizeof(arr)/sizeof(arr[0]);
                if(isEmpty())
                    cout<<"Queue is empty"<<endl;
                else
                {
                    cout<<"Deque element="<<arr[front]<<endl;
                    if(front==rear)
                    {
                        front=rear=-1;
                    }
                    else
                    {
                        front=(front+1)%size;
                    }
                }
            }
            void display()
            {
                if(isEmpty())
                    cout<<"Queue is empty";
                else
                {
                    int size=sizeof(arr)/sizeof(arr[0]);
                     int i = front;
                    while (true) 
                    {
                     cout<<arr[i]<<" ";
                     if (i == rear)
                     { break;}  // stop after printing last element
                     i = (i + 1) % size;
                    }
                }
                
            }
};
int main()
{

    circular_queue q;
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
    q.enque(39);
     q.display();
    return 0;
}