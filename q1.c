#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    // char a[10][8]= {"hi" , "hello" , "fellows"};
    // printf("%s" , a[2]);

    // char str1[]= "week-7-assignment";
    // char str2[]= {'w', 'e' ,'e' , 'k'};
    // int n1= sizeof(str1)/sizeof(str1[0]);
    // int n2= sizeof(str2)/sizeof(str2[0]);
    // int s= strlen(str1);
    // printf("%d\t%d", s,n1);

    char p[20];
    char s[]= "string";
    int length= strlen(s);
    int i;
    for (int i = 0; i < length; i++)
    {
        p[i]=s[length-i];

    }
    printf("%s", p);
    
return 0;
}