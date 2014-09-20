/*  1:   */ import java.util.Collections;
/*  2:   */ import java.util.Iterator;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ class ee
/*  6:   */   implements Iterable
/*  7:   */ {
/*  8:   */   private final Class a;
/*  9:   */   private final Iterable[] b;
/* 10:   */   
/* 11:   */   private ee(Class paramClass, Iterable[] paramArrayOfIterable)
/* 12:   */   {
/* 13:59 */     this.a = paramClass;
/* 14:60 */     this.b = paramArrayOfIterable;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public Iterator iterator()
/* 18:   */   {
/* 19:65 */     if (this.b.length <= 0) {
/* 20:67 */       return Collections.singletonList((Object[])eb.a(this.a, 0)).iterator();
/* 21:   */     }
/* 22:69 */     return new ef(this.a, this.b, null);
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ee
 * JD-Core Version:    0.7.0.1
 */