public class PatternOne
{
    public void pattern(int row,int column)
    {
        if(row<=0)
        {
            return;
        }
        if(column<row)
        {
            System.out.print(" * ");
            pattern(row,column+1);
        }
        else
        {
            System.out.println();
            pattern(row-1,0);
        }

    }
}
