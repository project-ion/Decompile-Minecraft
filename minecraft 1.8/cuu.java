/*   1:    */ import org.apache.logging.log4j.LogManager;
/*   2:    */ import org.apache.logging.log4j.Logger;
/*   3:    */ 
/*   4:    */ public class cuu
/*   5:    */ {
/*   6:  8 */   private static final Logger a = ;
/*   7:    */   private final cuv b;
/*   8:    */   private final cuw c;
/*   9:    */   private int d;
/*  10:    */   private int e;
/*  11:    */   private int f;
/*  12:    */   
/*  13:    */   public cuu(int paramInt1, cuv paramcuv, cuw paramcuw, int paramInt2)
/*  14:    */   {
/*  15: 17 */     if (!a(paramInt1, paramcuw))
/*  16:    */     {
/*  17: 18 */       a.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
/*  18: 19 */       this.c = cuw.d;
/*  19:    */     }
/*  20:    */     else
/*  21:    */     {
/*  22: 21 */       this.c = paramcuw;
/*  23:    */     }
/*  24: 24 */     this.b = paramcuv;
/*  25: 25 */     this.d = paramInt1;
/*  26: 26 */     this.e = paramInt2;
/*  27: 27 */     this.f = 0;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(int paramInt)
/*  31:    */   {
/*  32: 31 */     this.f = paramInt;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public int a()
/*  36:    */   {
/*  37: 35 */     return this.f;
/*  38:    */   }
/*  39:    */   
/*  40:    */   private final boolean a(int paramInt, cuw paramcuw)
/*  41:    */   {
/*  42: 39 */     return (paramInt == 0) || (paramcuw == cuw.d);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public final cuv b()
/*  46:    */   {
/*  47: 43 */     return this.b;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public final cuw c()
/*  51:    */   {
/*  52: 47 */     return this.c;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public final int d()
/*  56:    */   {
/*  57: 51 */     return this.e;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public final int e()
/*  61:    */   {
/*  62: 55 */     return this.d;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String toString()
/*  66:    */   {
/*  67: 60 */     return this.e + "," + this.c.a() + "," + this.b.b();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public final int f()
/*  71:    */   {
/*  72: 64 */     return this.b.a() * this.e;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public final boolean g()
/*  76:    */   {
/*  77: 68 */     return this.c == cuw.a;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean equals(Object paramObject)
/*  81:    */   {
/*  82: 73 */     if (this == paramObject) {
/*  83: 74 */       return true;
/*  84:    */     }
/*  85: 76 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/*  86: 77 */       return false;
/*  87:    */     }
/*  88: 80 */     cuu localcuu = (cuu)paramObject;
/*  89: 82 */     if (this.e != localcuu.e) {
/*  90: 83 */       return false;
/*  91:    */     }
/*  92: 85 */     if (this.d != localcuu.d) {
/*  93: 86 */       return false;
/*  94:    */     }
/*  95: 88 */     if (this.f != localcuu.f) {
/*  96: 89 */       return false;
/*  97:    */     }
/*  98: 91 */     if (this.b != localcuu.b) {
/*  99: 92 */       return false;
/* 100:    */     }
/* 101: 94 */     if (this.c != localcuu.c) {
/* 102: 95 */       return false;
/* 103:    */     }
/* 104: 98 */     return true;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public int hashCode()
/* 108:    */   {
/* 109:103 */     int i = this.b.hashCode();
/* 110:104 */     i = 31 * i + this.c.hashCode();
/* 111:105 */     i = 31 * i + this.d;
/* 112:106 */     i = 31 * i + this.e;
/* 113:107 */     i = 31 * i + this.f;
/* 114:108 */     return i;
/* 115:    */   }
/* 116:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cuu
 * JD-Core Version:    0.7.0.1
 */