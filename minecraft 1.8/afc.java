/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ class afc
/*   5:    */   extends yn
/*   6:    */ {
/*   7:    */   private afa g;
/*   8:    */   private int h;
/*   9:    */   
/*  10:    */   public afc(afa paramafa)
/*  11:    */   {
/*  12:168 */     super(paramafa);
/*  13:169 */     this.g = paramafa;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void c()
/*  17:    */   {
/*  18:174 */     if (!this.f) {
/*  19:176 */       return;
/*  20:    */     }
/*  21:179 */     double d1 = this.b - this.g.s;
/*  22:180 */     double d2 = this.c - this.g.t;
/*  23:181 */     double d3 = this.d - this.g.u;
/*  24:    */     
/*  25:183 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  26:185 */     if (this.h-- <= 0)
/*  27:    */     {
/*  28:186 */       this.h += this.g.bb().nextInt(5) + 2;
/*  29:    */       
/*  30:188 */       d4 = uv.a(d4);
/*  31:190 */       if (b(this.b, this.c, this.d, d4))
/*  32:    */       {
/*  33:191 */         this.g.v += d1 / d4 * 0.1D;
/*  34:192 */         this.g.w += d2 / d4 * 0.1D;
/*  35:193 */         this.g.x += d3 / d4 * 0.1D;
/*  36:    */       }
/*  37:    */       else
/*  38:    */       {
/*  39:195 */         this.f = false;
/*  40:    */       }
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   private boolean b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*  45:    */   {
/*  46:201 */     double d1 = (paramDouble1 - this.g.s) / paramDouble4;
/*  47:202 */     double d2 = (paramDouble2 - this.g.t) / paramDouble4;
/*  48:203 */     double d3 = (paramDouble3 - this.g.u) / paramDouble4;
/*  49:    */     
/*  50:205 */     brt localbrt = this.g.aQ();
/*  51:206 */     for (int i = 1; i < paramDouble4; i++)
/*  52:    */     {
/*  53:207 */       localbrt = localbrt.c(d1, d2, d3);
/*  54:208 */       if (!this.g.o.a(this.g, localbrt).isEmpty()) {
/*  55:209 */         return false;
/*  56:    */       }
/*  57:    */     }
/*  58:213 */     return true;
/*  59:    */   }
/*  60:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afc
 * JD-Core Version:    0.7.0.1
 */