#include<iostream>
using namespace std;
int binarySearch(int arr[],int n,int low,int high, int search_ele)
{
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(search_ele==arr[mid])
            return mid;
        else if(search_ele>arr[mid])
            low=mid+1;
        else
            high=mid-1;
    }
    return -1;
}
void initialize(int arr[],int n)
{
  cout<<"Enter the array elements=";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
}
void display(int arr[],int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }  
    cout<<endl;
}
int main()
{
    int n;
    cout<<"Selec the array size=";
    cin>>n;
    int arr[n];
    initialize(arr,n);
    cout<<endl;
    cout<<"Array elements are=";
    display(arr,n);
    cout<<endl;
    int low=0,high=n-1;
    int search_ele;
    cout<<"Enter the ele to search=";
    cin>>search_ele;
    int index=binarySearch(arr,n,low,high,search_ele);
    if(index!=-1)
        cout<<"Element is present at index="<<index;
    else
        cout<<"Element is not present in the array";
    return 0;
}