/*   1:    */ class us
/*   2:    */ {
/*   3:    */   final long a;
/*   4:    */   Object b;
/*   5:    */   us c;
/*   6:    */   final int d;
/*   7:    */   
/*   8:    */   us(int paramInt, long paramLong, Object paramObject, us paramus)
/*   9:    */   {
/*  10:204 */     this.b = paramObject;
/*  11:205 */     this.c = paramus;
/*  12:206 */     this.a = paramLong;
/*  13:207 */     this.d = paramInt;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public final long a()
/*  17:    */   {
/*  18:211 */     return this.a;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public final Object b()
/*  22:    */   {
/*  23:215 */     return this.b;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public final boolean equals(Object paramObject)
/*  27:    */   {
/*  28:220 */     if (!(paramObject instanceof us)) {
/*  29:221 */       return false;
/*  30:    */     }
/*  31:223 */     us localus = (us)paramObject;
/*  32:224 */     Long localLong1 = Long.valueOf(a());
/*  33:225 */     Long localLong2 = Long.valueOf(localus.a());
/*  34:226 */     if ((localLong1 == localLong2) || ((localLong1 != null) && (localLong1.equals(localLong2))))
/*  35:    */     {
/*  36:227 */       Object localObject1 = b();
/*  37:228 */       Object localObject2 = localus.b();
/*  38:229 */       if ((localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2)))) {
/*  39:230 */         return true;
/*  40:    */       }
/*  41:    */     }
/*  42:233 */     return false;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public final int hashCode()
/*  46:    */   {
/*  47:237 */     return ur.f(this.a);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public final String toString()
/*  51:    */   {
/*  52:241 */     return a() + "=" + b();
/*  53:    */   }
/*  54:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     us
 * JD-Core Version:    0.7.0.1
 */