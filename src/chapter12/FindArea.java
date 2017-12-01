package chapter12;
/*  	Program to Find area of a room using Function Overloading  */
class FindArea{
int leangth;
int breadth;
int area;
int Area (int x){
leangth = breadth = x;
area = leangth * breadth;
//..
return area;
}
int Area (int x, int y){
leangth = x;
breadth = y;
area = leangth * breadth;
//...
return area;
}
}
