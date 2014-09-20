/*  1:   */ public class aww
/*  2:   */   extends baa
/*  3:   */ {
/*  4:   */   public aww()
/*  5:   */   {
/*  6:16 */     super(bof.b);
/*  7:17 */     j(this.L.b().a(M, el.b));
/*  8:18 */     a(akf.b);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public bec a(int paramInt)
/* 12:   */   {
/* 13:23 */     el localel = el.b;
/* 14:24 */     int i = paramInt & 0xC;
/* 15:25 */     if (i == 4) {
/* 16:26 */       localel = el.a;
/* 17:27 */     } else if (i == 8) {
/* 18:28 */       localel = el.c;
/* 19:   */     }
/* 20:30 */     return P().a(M, localel);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int c(bec parambec)
/* 24:   */   {
/* 25:36 */     int i = 0;
/* 26:   */     
/* 27:38 */     el localel = (el)parambec.b(M);
/* 28:39 */     if (localel == el.a) {
/* 29:40 */       i |= 0x4;
/* 30:41 */     } else if (localel == el.c) {
/* 31:42 */       i |= 0x8;
/* 32:   */     }
/* 33:45 */     return i;
/* 34:   */   }
/* 35:   */   
/* 36:   */   protected bed e()
/* 37:   */   {
/* 38:50 */     return new bed(this, new bex[] { M });
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected amj i(bec parambec)
/* 42:   */   {
/* 43:55 */     return new amj(alq.a(this), 1, 0);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 47:   */   {
/* 48:60 */     return super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm).a(M, paramej.k());
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aww
 * JD-Core Version:    0.7.0.1
 */