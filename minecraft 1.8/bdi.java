/*  1:   */ public class bdi
/*  2:   */   extends bcm
/*  3:   */ {
/*  4:   */   public byte a;
/*  5:   */   public boolean f;
/*  6:   */   
/*  7:   */   public void b(fn paramfn)
/*  8:   */   {
/*  9:16 */     super.b(paramfn);
/* 10:17 */     paramfn.a("note", this.a);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(fn paramfn)
/* 14:   */   {
/* 15:22 */     super.a(paramfn);
/* 16:23 */     this.a = paramfn.d("note");
/* 17:24 */     this.a = ((byte)uv.a(this.a, 0, 24));
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void b()
/* 21:   */   {
/* 22:28 */     this.a = ((byte)((this.a + 1) % 25));
/* 23:29 */     o_();
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(aqu paramaqu, dt paramdt)
/* 27:   */   {
/* 28:33 */     if (paramaqu.p(paramdt.a()).c().r() != bof.a) {
/* 29:34 */       return;
/* 30:   */     }
/* 31:37 */     bof localbof = paramaqu.p(paramdt.b()).c().r();
/* 32:   */     
/* 33:39 */     int i = 0;
/* 34:40 */     if (localbof == bof.e) {
/* 35:41 */       i = 1;
/* 36:   */     }
/* 37:43 */     if (localbof == bof.p) {
/* 38:44 */       i = 2;
/* 39:   */     }
/* 40:46 */     if (localbof == bof.s) {
/* 41:47 */       i = 3;
/* 42:   */     }
/* 43:49 */     if (localbof == bof.d) {
/* 44:50 */       i = 4;
/* 45:   */     }
/* 46:53 */     paramaqu.c(paramdt, aty.B, i, this.a);
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bdi
 * JD-Core Version:    0.7.0.1
 */