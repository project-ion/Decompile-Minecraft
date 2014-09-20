/*   1:    */ public class mj
/*   2:    */   extends mg
/*   3:    */ {
/*   4:    */   public mj()
/*   5:    */   {
/*   6: 91 */     this.h = true;
/*   7:    */   }
/*   8:    */   
/*   9:    */   public mj(float paramFloat1, float paramFloat2, boolean paramBoolean)
/*  10:    */   {
/*  11: 95 */     this.d = paramFloat1;
/*  12: 96 */     this.e = paramFloat2;
/*  13: 97 */     this.f = paramBoolean;
/*  14: 98 */     this.h = true;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(hd paramhd)
/*  18:    */   {
/*  19:103 */     this.d = paramhd.readFloat();
/*  20:104 */     this.e = paramhd.readFloat();
/*  21:105 */     super.a(paramhd);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void b(hd paramhd)
/*  25:    */   {
/*  26:110 */     paramhd.writeFloat(this.d);
/*  27:111 */     paramhd.writeFloat(this.e);
/*  28:112 */     super.b(paramhd);
/*  29:    */   }
/*  30:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     mj
 * JD-Core Version:    0.7.0.1
 */