/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agv
/*   4:    */   implements agw
/*   5:    */ {
/*   6:    */   public amj a;
/*   7:    */   public agx b;
/*   8:    */   
/*   9:    */   public agv(alq paramalq, agx paramagx)
/*  10:    */   {
/*  11:807 */     this.a = new amj(paramalq);
/*  12:808 */     this.b = paramagx;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public agv(amj paramamj, agx paramagx)
/*  16:    */   {
/*  17:812 */     this.a = paramamj;
/*  18:813 */     this.b = paramagx;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(aqd paramaqd, Random paramRandom)
/*  22:    */   {
/*  23:818 */     int i = 1;
/*  24:819 */     if (this.b != null) {
/*  25:820 */       i = this.b.a(paramRandom);
/*  26:    */     }
/*  27:    */     amj localamj1;
/*  28:    */     amj localamj2;
/*  29:825 */     if (i < 0)
/*  30:    */     {
/*  31:826 */       localamj1 = new amj(amk.bO, 1, 0);
/*  32:827 */       localamj2 = new amj(this.a.b(), -i, this.a.i());
/*  33:    */     }
/*  34:    */     else
/*  35:    */     {
/*  36:829 */       localamj1 = new amj(amk.bO, i, 0);
/*  37:830 */       localamj2 = new amj(this.a.b(), 1, this.a.i());
/*  38:    */     }
/*  39:832 */     paramaqd.add(new aqc(localamj1, localamj2));
/*  40:    */   }
/*  41:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     agv
 * JD-Core Version:    0.7.0.1
 */