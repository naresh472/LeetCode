bool areAlmostEqual(char* s1, char* s2) {

    int index1=-1,index2=-1,count = 0;
    for(int i=0 ; s1[i] != '\0';i++)
    {
        if(s1[i] != s2[i])
        {
            if(count == 0)
            {
                index1 = i;
                
            }
            else if(count == 1)
            {
                index2 = i;
                
            }
            count++;
        }

        if(count > 2) return false;
    }
    
    if(count == 1 ) return false;
    if(count == 0) return true;

    return (s1[index1] == s2[index2] && s1[index2] == s2[index1]);
    
}