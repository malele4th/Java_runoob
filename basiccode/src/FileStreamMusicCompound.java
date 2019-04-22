import java.io.*;

public class FileStreamMusicCompound 
{
    public static void main(String args[])
    {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        String fileNames[] = {"F:/java/music/星月神话.mp3","F:/java/music/我只在乎你.mp3"};
       
        byte by[] = new byte[1024*8];   //设置byte数组，每次往输出流中传入8K的内容
        try
        {
            fileOutputStream = new FileOutputStream("F:/java/music/合并.mp3");
            
            for(int i=0;i<2;i++)
            {
                int count = 0;
                fileInputStream = new FileInputStream(fileNames[i]);
                fileInputStream.skip(1024*1024*3);  //跳过前面3M的歌曲内容
                
                while(fileInputStream.read(by) != -1)
                {                    
                    fileOutputStream.write(by);
                    count++;
                    System.out.println(count);
                    
                    if(count == (1024*2/8))  //要截取中间2MB的内容，每次输入8k的内容，所以输入的次数是1024*2/8
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
                fileInputStream.close();  //输出完成后关闭输入输出流
                fileOutputStream.close();
            } 
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}