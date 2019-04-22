import java.io.*;

public class FileStreamMusicCompound 
{
    public static void main(String args[])
    {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        String fileNames[] = {"F:/java/music/������.mp3","F:/java/music/��ֻ�ں���.mp3"};
       
        byte by[] = new byte[1024*8];   //����byte���飬ÿ����������д���8K������
        try
        {
            fileOutputStream = new FileOutputStream("F:/java/music/�ϲ�.mp3");
            
            for(int i=0;i<2;i++)
            {
                int count = 0;
                fileInputStream = new FileInputStream(fileNames[i]);
                fileInputStream.skip(1024*1024*3);  //����ǰ��3M�ĸ�������
                
                while(fileInputStream.read(by) != -1)
                {                    
                    fileOutputStream.write(by);
                    count++;
                    System.out.println(count);
                    
                    if(count == (1024*2/8))  //Ҫ��ȡ�м�2MB�����ݣ�ÿ������8k�����ݣ���������Ĵ�����1024*2/8
                    {
                        break;
                    }
                }
            }
        }
        
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                fileInputStream.close();  //�����ɺ�ر����������
                fileOutputStream.close();
            } 
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}