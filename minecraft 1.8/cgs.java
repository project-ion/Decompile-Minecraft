/*  1:   */ public class cgs
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   private xm a;
/*  5:   */   
/*  6:   */   protected cgs(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  7:   */   {
/*  8:25 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  9:26 */     this.ap = (this.aq = this.ar = 1.0F);
/* 10:27 */     this.v = (this.w = this.x = 0.0D);
/* 11:28 */     this.i = 0.0F;
/* 12:29 */     this.g = 30;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public int a()
/* 16:   */   {
/* 17:34 */     return 3;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void s_()
/* 21:   */   {
/* 22:39 */     super.s_();
/* 23:41 */     if (this.a == null)
/* 24:   */     {
/* 25:42 */       afg localafg = new afg(this.o);
/* 26:43 */       localafg.cm();
/* 27:44 */       this.a = localafg;
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(civ paramciv, wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 32:   */   {
/* 33:50 */     if (this.a == null) {
/* 34:51 */       return;
/* 35:   */     }
/* 36:53 */     cpt localcpt = bsu.z().ae();
/* 37:   */     
/* 38:55 */     localcpt.a(cgw.au, cgw.av, cgw.aw);
/* 39:   */     
/* 40:   */ 
/* 41:58 */     float f1 = 0.4255319F;
/* 42:59 */     float f2 = (this.f + paramFloat1) / this.g;
/* 43:   */     
/* 44:61 */     cjm.a(true);
/* 45:62 */     cjm.l();
/* 46:63 */     cjm.j();
/* 47:64 */     cjm.b(770, 771);
/* 48:65 */     float f3 = 240.0F;
/* 49:66 */     dax.a(dax.q, f3, f3);
/* 50:   */     
/* 51:68 */     cjm.E();
/* 52:69 */     float f4 = 0.05F + 0.5F * uv.a(f2 * 3.141593F);
/* 53:70 */     cjm.c(1.0F, 1.0F, 1.0F, f4);
/* 54:   */     
/* 55:72 */     cjm.b(0.0F, 1.8F, 0.0F);
/* 56:73 */     cjm.b(180.0F - paramwv.y, 0.0F, 1.0F, 0.0F);
/* 57:74 */     cjm.b(60.0F - 150.0F * f2 - paramwv.z, 1.0F, 0.0F, 0.0F);
/* 58:75 */     cjm.b(0.0F, -0.4F, -1.5F);
/* 59:76 */     cjm.a(f1, f1, f1);
/* 60:77 */     this.a.y = (this.a.A = 0.0F);
/* 61:78 */     this.a.aI = (this.a.aJ = 0.0F);
/* 62:79 */     localcpt.a(this.a, 0.0D, 0.0D, 0.0D, 0.0F, paramFloat1);
/* 63:80 */     cjm.F();
/* 64:   */     
/* 65:82 */     cjm.j();
/* 66:   */   }
/* 67:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cgs
 * JD-Core Version:    0.7.0.1
 */