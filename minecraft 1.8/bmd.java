/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bmd
/*   5:    */   extends bly
/*   6:    */ {
/*   7:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*   8:    */   {
/*   9:889 */     if ((this.m == ej.c) || (this.m == ej.f)) {
/*  10:890 */       c((bmh)parambms, paramList, paramRandom, 1, 1);
/*  11:    */     } else {
/*  12:892 */       b((bmh)parambms, paramList, paramRandom, 1, 1);
/*  13:    */     }
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  17:    */   {
/*  18:898 */     if (a(paramaqu, parambjb)) {
/*  19:899 */       return false;
/*  20:    */     }
/*  21:903 */     a(paramaqu, parambjb, 0, 0, 0, 4, 4, 4, true, paramRandom, blr.c());
/*  22:    */     
/*  23:905 */     a(paramaqu, paramRandom, parambjb, this.d, 1, 1, 0);
/*  24:907 */     if ((this.m == ej.c) || (this.m == ej.f)) {
/*  25:908 */       a(paramaqu, parambjb, 4, 1, 1, 4, 3, 3, aty.a.P(), aty.a.P(), false);
/*  26:    */     } else {
/*  27:910 */       a(paramaqu, parambjb, 0, 1, 1, 0, 3, 3, aty.a.P(), aty.a.P(), false);
/*  28:    */     }
/*  29:913 */     return true;
/*  30:    */   }
/*  31:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bmd
 * JD-Core Version:    0.7.0.1
 */