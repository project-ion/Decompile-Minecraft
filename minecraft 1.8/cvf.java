/*  1:   */ import com.google.common.collect.Sets;
/*  2:   */ import java.io.BufferedInputStream;
/*  3:   */ import java.io.File;
/*  4:   */ import java.io.FileInputStream;
/*  5:   */ import java.io.InputStream;
/*  6:   */ import java.util.HashSet;
/*  7:   */ import java.util.Set;
/*  8:   */ import org.apache.commons.io.filefilter.DirectoryFileFilter;
/*  9:   */ 
/* 10:   */ public class cvf
/* 11:   */   extends cuy
/* 12:   */ {
/* 13:   */   public cvf(File paramFile)
/* 14:   */   {
/* 15:11 */     super(paramFile);
/* 16:   */   }
/* 17:   */   
/* 18:   */   protected InputStream a(String paramString)
/* 19:   */   {
/* 20:16 */     return new BufferedInputStream(new FileInputStream(new File(this.a, paramString)));
/* 21:   */   }
/* 22:   */   
/* 23:   */   protected boolean b(String paramString)
/* 24:   */   {
/* 25:21 */     return new File(this.a, paramString).isFile();
/* 26:   */   }
/* 27:   */   
/* 28:   */   public Set c()
/* 29:   */   {
/* 30:26 */     HashSet localHashSet = Sets.newHashSet();
/* 31:27 */     File localFile1 = new File(this.a, "assets/");
/* 32:29 */     if (localFile1.isDirectory()) {
/* 33:30 */       for (File localFile2 : localFile1.listFiles(DirectoryFileFilter.DIRECTORY))
/* 34:   */       {
/* 35:31 */         String str = a(localFile1, localFile2);
/* 36:33 */         if (!str.equals(str.toLowerCase())) {
/* 37:34 */           c(str);
/* 38:   */         } else {
/* 39:36 */           localHashSet.add(str.substring(0, str.length() - 1));
/* 40:   */         }
/* 41:   */       }
/* 42:   */     }
/* 43:41 */     return localHashSet;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cvf
 * JD-Core Version:    0.7.0.1
 */