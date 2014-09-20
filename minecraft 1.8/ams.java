/*  1:   */ import com.google.common.base.Function;
/*  2:   */ 
/*  3:   */ class ams
/*  4:   */   implements Function
/*  5:   */ {
/*  6:   */   ams(String[] paramArrayOfString) {}
/*  7:   */   
/*  8:   */   public String a(amj paramamj)
/*  9:   */   {
/* 10:27 */     int i = paramamj.i();
/* 11:28 */     if ((i < 0) || (i >= this.a.length)) {
/* 12:29 */       i = 0;
/* 13:   */     }
/* 14:31 */     return this.a[i];
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ams
 * JD-Core Version:    0.7.0.1
 */