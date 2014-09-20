/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.cache.CacheBuilder;
/*   3:    */ import com.google.common.cache.LoadingCache;
/*   4:    */ 
/*   5:    */ public class bek
/*   6:    */ {
/*   7:    */   private final Predicate[][][] a;
/*   8:    */   private final int b;
/*   9:    */   private final int c;
/*  10:    */   private final int d;
/*  11:    */   
/*  12:    */   public bek(Predicate[][][] paramArrayOfPredicate)
/*  13:    */   {
/*  14: 21 */     this.a = paramArrayOfPredicate;
/*  15:    */     
/*  16: 23 */     this.b = paramArrayOfPredicate.length;
/*  17: 25 */     if (this.b > 0)
/*  18:    */     {
/*  19: 26 */       this.c = paramArrayOfPredicate[0].length;
/*  20: 28 */       if (this.c > 0) {
/*  21: 29 */         this.d = paramArrayOfPredicate[0][0].length;
/*  22:    */       } else {
/*  23: 31 */         this.d = 0;
/*  24:    */       }
/*  25:    */     }
/*  26:    */     else
/*  27:    */     {
/*  28: 34 */       this.c = 0;
/*  29: 35 */       this.d = 0;
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   public int b()
/*  34:    */   {
/*  35: 44 */     return this.c;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public int c()
/*  39:    */   {
/*  40: 48 */     return this.d;
/*  41:    */   }
/*  42:    */   
/*  43:    */   private bem a(dt paramdt, ej paramej1, ej paramej2, LoadingCache paramLoadingCache)
/*  44:    */   {
/*  45: 63 */     for (int i = 0; i < this.d; i++) {
/*  46: 64 */       for (int j = 0; j < this.c; j++) {
/*  47: 65 */         for (int k = 0; k < this.b; k++) {
/*  48: 66 */           if (!this.a[k][j][i].apply(paramLoadingCache.getUnchecked(a(paramdt, paramej1, paramej2, i, j, k)))) {
/*  49: 67 */             return null;
/*  50:    */           }
/*  51:    */         }
/*  52:    */       }
/*  53:    */     }
/*  54: 73 */     return new bem(paramdt, paramej1, paramej2, paramLoadingCache);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public bem a(aqu paramaqu, dt paramdt)
/*  58:    */   {
/*  59: 78 */     LoadingCache localLoadingCache = CacheBuilder.newBuilder().build(new bel(paramaqu));
/*  60:    */     
/*  61: 80 */     int i = Math.max(Math.max(this.d, this.c), this.b);
/*  62: 82 */     for (dt localdt : dt.a(paramdt, paramdt.a(i - 1, i - 1, i - 1))) {
/*  63: 83 */       for (ej localej1 : ej.values()) {
/*  64: 84 */         for (ej localej2 : ej.values()) {
/*  65: 85 */           if ((localej2 != localej1) && (localej2 != localej1.d()))
/*  66:    */           {
/*  67: 89 */             bem localbem = a(localdt, localej1, localej2, localLoadingCache);
/*  68: 90 */             if (localbem != null) {
/*  69: 91 */               return localbem;
/*  70:    */             }
/*  71:    */           }
/*  72:    */         }
/*  73:    */       }
/*  74:    */     }
/*  75: 97 */     return null;
/*  76:    */   }
/*  77:    */   
/*  78:    */   protected static dt a(dt paramdt, ej paramej1, ej paramej2, int paramInt1, int paramInt2, int paramInt3)
/*  79:    */   {
/*  80:101 */     if ((paramej1 == paramej2) || (paramej1 == paramej2.d())) {
/*  81:102 */       throw new IllegalArgumentException("Invalid forwards & up combination");
/*  82:    */     }
/*  83:105 */     fd localfd1 = new fd(paramej1.g(), paramej1.h(), paramej1.i());
/*  84:106 */     fd localfd2 = new fd(paramej2.g(), paramej2.h(), paramej2.i());
/*  85:107 */     fd localfd3 = localfd1.d(localfd2);
/*  86:    */     
/*  87:109 */     return paramdt.a(localfd2.n() * -paramInt2 + localfd3.n() * paramInt1 + localfd1.n() * paramInt3, localfd2.o() * -paramInt2 + localfd3.o() * paramInt1 + localfd1.o() * paramInt3, localfd2.p() * -paramInt2 + localfd3.p() * paramInt1 + localfd1.p() * paramInt3);
/*  88:    */   }
/*  89:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bek
 * JD-Core Version:    0.7.0.1
 */