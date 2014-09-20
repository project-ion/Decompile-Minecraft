/*   1:    */ import java.util.Comparator;
/*   2:    */ 
/*   3:    */ public class aas
/*   4:    */   implements Comparator
/*   5:    */ {
/*   6:    */   private final wv a;
/*   7:    */   
/*   8:    */   public aas(wv paramwv)
/*   9:    */   {
/*  10: 93 */     this.a = paramwv;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public int a(wv paramwv1, wv paramwv2)
/*  14:    */   {
/*  15: 98 */     double d1 = this.a.h(paramwv1);
/*  16: 99 */     double d2 = this.a.h(paramwv2);
/*  17:100 */     if (d1 < d2) {
/*  18:101 */       return -1;
/*  19:    */     }
/*  20:103 */     if (d1 > d2) {
/*  21:104 */       return 1;
/*  22:    */     }
/*  23:106 */     return 0;
/*  24:    */   }
/*  25:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aas
 * JD-Core Version:    0.7.0.1
 */