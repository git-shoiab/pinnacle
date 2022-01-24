
//  DateToJPGFileNames.java  (c) 2004 Kari Laitinen

//  2004-01-28  File created.
//  2005-05-09  Last modification.

//  With this program you can rename .jpg files so that date
//  and time are included in the file names in the following
//  way:

//   fYYYYMMDD_HHMM_text_NN.jpg

//  The date and time are taken from the time info that is included
//  in the .jpg file in question. NN is the serial number of the file
//  in the directory in which the program is executed. The "text" to
//  the file names can be given from the command line when the
//  program is executed.

//  When you rename your .jpg files with this program, the photos
//  come automatically in a correct chronological order. Your digital
//  camera must be capable of putting the correct date and time to
//  the files.

//  Samsung Digimax 350 SE camera does not put
//  milliseconds to the file time.

import java.io.* ;

class DateToJPGFileNames
{
   public static void main( String[] command_line_parameters )
   {
      String  picture_description  =  "" ;

      if ( command_line_parameters.length  == 1 )
      {
         picture_description  =  command_line_parameters[ 0 ] ;
      }

      File  this_directory  =  new  File( "." ) ;

      String[]  files_in_this_directory  =  this_directory.list() ;

      for ( int file_index  =  0 ;
                file_index  <  files_in_this_directory.length ;
                file_index  ++ )
      {

         String  old_file_name  =  files_in_this_directory[ file_index ] ;

         if ( old_file_name.endsWith( ".jpg" ) ||
              old_file_name.endsWith( ".JPG" ) )
         {
            File jpg_file  =  new  File( old_file_name ) ;

            long  last_write_time_as_ticks  =  jpg_file.lastModified() ;


            //  In the following format specification:

            //  % begins each separate format specifier

            //  1$  refers to last_write_time_as_ticks
            //  2$  refers to picture_description
            //  3$  refers to the last parameter

            //  t begins a time-related format specifier

            //  Y, m, and d refer to the year, month, and day, respectively
            //  H and M refer to hour and minute, respectively


            String  new_file_name  =  

               String.format( "f%1$tY%1$tm%1$td_%1$tH%1$tM_%2$s_%3$d.jpg",

                               last_write_time_as_ticks,
                               picture_description,
                               ( file_index + 1 ) ) ;
 
            jpg_file.renameTo( new File( new_file_name ) ) ;

            System.out.print( "\n " + old_file_name
                          +   "  "  + new_file_name ) ;

         }

      }
   }
}



