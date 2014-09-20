/*  1:   */ import org.apache.commons.lang3.Validate;
/*  2:   */ 
/*  3:   */ public class eh
/*  4:   */   extends ev
/*  5:   */ {
/*  6:   */   private final Object d;
/*  7:   */   private Object e;
/*  8:   */   
/*  9:   */   public eh(Object paramObject)
/* 10:   */   {
/* 11:12 */     this.d = paramObject;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(int paramInt, Object paramObject1, Object paramObject2)
/* 15:   */   {
/* 16:17 */     if (this.d.equals(paramObject1)) {
/* 17:18 */       this.e = paramObject2;
/* 18:   */     }
/* 19:21 */     super.a(paramInt, paramObject1, paramObject2);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a()
/* 23:   */   {
/* 24:25 */     Validate.notNull(this.d);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Object a(Object paramObject)
/* 28:   */   {
/* 29:30 */     Object localObject = super.a(paramObject);
/* 30:31 */     return localObject == null ? this.e : localObject;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Object a(int paramInt)
/* 34:   */   {
/* 35:37 */     Object localObject = super.a(paramInt);
/* 36:38 */     return localObject == null ? this.e : localObject;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     eh
 * JD-Core Version:    0.7.0.1
 */