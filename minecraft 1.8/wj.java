/*  1:   */ public class wj
/*  2:   */   extends wi
/*  3:   */ {
/*  4:   */   private wv r;
/*  5:   */   
/*  6:   */   public wj(String paramString, wv paramwv1, wv paramwv2)
/*  7:   */   {
/*  8:14 */     super(paramString, paramwv1);
/*  9:15 */     this.r = paramwv2;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public wv i()
/* 13:   */   {
/* 14:20 */     return this.q;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public wv j()
/* 18:   */   {
/* 19:25 */     return this.r;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public ho b(xm paramxm)
/* 23:   */   {
/* 24:30 */     ho localho = this.r == null ? this.q.e_() : this.r.e_();
/* 25:31 */     Object localObject = (this.r instanceof xm) ? ((xm)this.r).bz() : null;
/* 26:32 */     String str1 = "death.attack." + this.p;
/* 27:33 */     String str2 = str1 + ".item";
/* 28:35 */     if ((localObject != null) && (localObject.s()) && (fi.c(str2))) {
/* 29:36 */       return new hz(str2, new Object[] { paramxm.e_(), localho, localObject.C() });
/* 30:   */     }
/* 31:38 */     return new hz(str1, new Object[] { paramxm.e_(), localho });
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     wj
 * JD-Core Version:    0.7.0.1
 */