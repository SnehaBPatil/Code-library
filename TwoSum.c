
int* twoSum(int* a, int numsSize, int target, int* returnSize){
int i,j;
    *returnSize=2;
    int *ans;
    ans=calloc(*returnSize,sizeof(int));
    for(i=0;i<numsSize;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            if(a[i]+a[j]==target)
            {
                ans[0]=i;
                ans[1]=j;
            }
        }
    }
    return ans;
}
