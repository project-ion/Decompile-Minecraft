/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agc
/*   4:    */   extends yn
/*   5:    */ {
/*   6:    */   private float g;
/*   7:    */   private int h;
/*   8:    */   private afy i;
/*   9:    */   private boolean j;
/*  10:    */   
/*  11:    */   public agc(afy paramafy)
/*  12:    */   {
/*  13:310 */     super(paramafy);
/*  14:311 */     this.i = paramafy;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(float paramFloat, boolean paramBoolean)
/*  18:    */   {
/*  19:315 */     this.g = paramFloat;
/*  20:316 */     this.j = paramBoolean;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(double paramDouble)
/*  24:    */   {
/*  25:320 */     this.e = paramDouble;
/*  26:321 */     this.f = true;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void c()
/*  30:    */   {
/*  31:326 */     this.a.y = a(this.a.y, this.g, 30.0F);
/*  32:327 */     this.a.aI = this.a.y;
/*  33:328 */     this.a.aG = this.a.y;
/*  34:330 */     if (!this.f)
/*  35:    */     {
/*  36:331 */       this.a.m(0.0F);
/*  37:332 */       return;
/*  38:    */     }
/*  39:334 */     this.f = false;
/*  40:336 */     if (this.a.C)
/*  41:    */     {
/*  42:337 */       this.a.j((float)(this.e * this.a.a(afs.d).e()));
/*  43:338 */       if (this.h-- <= 0)
/*  44:    */       {
/*  45:339 */         this.h = this.i.ce();
/*  46:340 */         if (this.j) {
/*  47:341 */           this.h /= 3;
/*  48:    */         }
/*  49:343 */         this.i.r().a();
/*  50:344 */         if (this.i.cl()) {
/*  51:345 */           this.i.a(this.i.ci(), this.i.bA(), ((this.i.bb().nextFloat() - this.i.bb().nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*  52:    */         }
/*  53:    */       }
/*  54:    */       else
/*  55:    */       {
/*  56:348 */         this.i.aX = (this.i.aY = 0.0F);
/*  57:349 */         this.a.j(0.0F);
/*  58:    */       }
/*  59:    */     }
/*  60:    */     else
/*  61:    */     {
/*  62:352 */       this.a.j((float)(this.e * this.a.a(afs.d).e()));
/*  63:    */     }
/*  64:    */   }
/*  65:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     agc
 * JD-Core Version:    0.7.0.1
 */