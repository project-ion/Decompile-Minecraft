/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bly
/*   5:    */   extends bmk
/*   6:    */ {
/*   7:    */   public bly() {}
/*   8:    */   
/*   9:    */   public bly(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*  10:    */   {
/*  11:831 */     super(paramInt);
/*  12:    */     
/*  13:833 */     this.m = paramej;
/*  14:834 */     this.d = a(paramRandom);
/*  15:835 */     this.l = parambjb;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  19:    */   {
/*  20:840 */     if ((this.m == ej.c) || (this.m == ej.f)) {
/*  21:841 */       b((bmh)parambms, paramList, paramRandom, 1, 1);
/*  22:    */     } else {
/*  23:843 */       c((bmh)parambms, paramList, paramRandom, 1, 1);
/*  24:    */     }
/*  25:    */   }
/*  26:    */   
/*  27:    */   public static bly a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*  28:    */   {
/*  29:848 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 5, paramej);
/*  30:850 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  31:851 */       return null;
/*  32:    */     }
/*  33:854 */     return new bly(paramInt4, paramRandom, localbjb, paramej);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  37:    */   {
/*  38:859 */     if (a(paramaqu, parambjb)) {
/*  39:860 */       return false;
/*  40:    */     }
/*  41:864 */     a(paramaqu, parambjb, 0, 0, 0, 4, 4, 4, true, paramRandom, blr.c());
/*  42:    */     
/*  43:866 */     a(paramaqu, paramRandom, parambjb, this.d, 1, 1, 0);
/*  44:868 */     if ((this.m == ej.c) || (this.m == ej.f)) {
/*  45:869 */       a(paramaqu, parambjb, 0, 1, 1, 0, 3, 3, aty.a.P(), aty.a.P(), false);
/*  46:    */     } else {
/*  47:871 */       a(paramaqu, parambjb, 4, 1, 1, 4, 3, 3, aty.a.P(), aty.a.P(), false);
/*  48:    */     }
/*  49:874 */     return true;
/*  50:    */   }
/*  51:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bly
 * JD-Core Version:    0.7.0.1
 */