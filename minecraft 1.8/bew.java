/*  1:   */ import com.google.common.collect.ImmutableSet;
/*  2:   */ import com.google.common.collect.Sets;
/*  3:   */ import java.util.Collection;
/*  4:   */ import java.util.HashSet;
/*  5:   */ import java.util.Set;
/*  6:   */ 
/*  7:   */ public class bew
/*  8:   */   extends bes
/*  9:   */ {
/* 10:   */   private final ImmutableSet a;
/* 11:   */   
/* 12:   */   protected bew(String paramString, int paramInt1, int paramInt2)
/* 13:   */   {
/* 14:13 */     super(paramString, Integer.class);
/* 15:14 */     if (paramInt1 < 0) {
/* 16:15 */       throw new IllegalArgumentException("Min value of " + paramString + " must be 0 or greater");
/* 17:   */     }
/* 18:17 */     if (paramInt2 <= paramInt1) {
/* 19:18 */       throw new IllegalArgumentException("Max value of " + paramString + " must be greater than min (" + paramInt1 + ")");
/* 20:   */     }
/* 21:21 */     HashSet localHashSet = Sets.newHashSet();
/* 22:22 */     for (int i = paramInt1; i <= paramInt2; i++) {
/* 23:23 */       localHashSet.add(Integer.valueOf(i));
/* 24:   */     }
/* 25:26 */     this.a = ImmutableSet.copyOf(localHashSet);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public Collection c()
/* 29:   */   {
/* 30:31 */     return this.a;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean equals(Object paramObject)
/* 34:   */   {
/* 35:36 */     if (this == paramObject) {
/* 36:37 */       return true;
/* 37:   */     }
/* 38:39 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/* 39:40 */       return false;
/* 40:   */     }
/* 41:42 */     if (!super.equals(paramObject)) {
/* 42:43 */       return false;
/* 43:   */     }
/* 44:46 */     bew localbew = (bew)paramObject;
/* 45:47 */     return this.a.equals(localbew.a);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int hashCode()
/* 49:   */   {
/* 50:52 */     int i = super.hashCode();
/* 51:53 */     i = 31 * i + this.a.hashCode();
/* 52:54 */     return i;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public static bew a(String paramString, int paramInt1, int paramInt2)
/* 56:   */   {
/* 57:58 */     return new bew(paramString, paramInt1, paramInt2);
/* 58:   */   }
/* 59:   */   
/* 60:   */   public String a(Integer paramInteger)
/* 61:   */   {
/* 62:68 */     return paramInteger.toString();
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bew
 * JD-Core Version:    0.7.0.1
 */