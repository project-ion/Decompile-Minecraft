/*  1:   */ import java.util.Comparator;
/*  2:   */ 
/*  3:   */ final class bsb
/*  4:   */   implements Comparator
/*  5:   */ {
/*  6:   */   public int a(bsa parambsa1, bsa parambsa2)
/*  7:   */   {
/*  8:12 */     if (parambsa1.c() > parambsa2.c()) {
/*  9:13 */       return 1;
/* 10:   */     }
/* 11:14 */     if (parambsa1.c() < parambsa2.c()) {
/* 12:15 */       return -1;
/* 13:   */     }
/* 14:17 */     return parambsa2.e().compareToIgnoreCase(parambsa1.e());
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bsb
 * JD-Core Version:    0.7.0.1
 */