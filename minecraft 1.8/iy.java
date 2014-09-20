/*  1:   */ public class iy
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private String[] a;
/*  5:   */   
/*  6:   */   public iy() {}
/*  7:   */   
/*  8:   */   public iy(String[] paramArrayOfString)
/*  9:   */   {
/* 10:16 */     this.a = paramArrayOfString;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(hd paramhd)
/* 14:   */   {
/* 15:21 */     this.a = new String[paramhd.e()];
/* 16:23 */     for (int i = 0; i < this.a.length; i++) {
/* 17:24 */       this.a[i] = paramhd.c(32767);
/* 18:   */     }
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void b(hd paramhd)
/* 22:   */   {
/* 23:30 */     paramhd.b(this.a.length);
/* 24:32 */     for (String str : this.a) {
/* 25:33 */       paramhd.a(str);
/* 26:   */     }
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(ik paramik)
/* 30:   */   {
/* 31:39 */     paramik.a(this);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String[] a()
/* 35:   */   {
/* 36:43 */     return this.a;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     iy
 * JD-Core Version:    0.7.0.1
 */