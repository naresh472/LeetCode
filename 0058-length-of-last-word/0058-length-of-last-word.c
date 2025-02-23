int lengthOfLastWord(char* s) {
    int lastCount= 0;
    int count = 0;
    int space = 0;
    
    for(int i = 0 ; s[i] != '\0' ; i++)
    {
       
        if(isspace(s[i]))
        {
            if(space)
            {
                lastCount = count;
                count = 0;
                space = 0;
            }
            
        }
        else
        {
            count++;
            space = 1;
        }
        
    }

    return space?count:lastCount;

    
}