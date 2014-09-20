/*   1:    */ import com.google.common.base.Objects;
/*   2:    */ import com.google.common.base.Objects.ToStringHelper;
/*   3:    */ 
/*   4:    */ public class fd
/*   5:    */   implements Comparable
/*   6:    */ {
/*   7: 12 */   public static final fd e = new fd(0, 0, 0);
/*   8:    */   private final int a;
/*   9:    */   private final int b;
/*  10:    */   private final int c;
/*  11:    */   
/*  12:    */   public fd(int paramInt1, int paramInt2, int paramInt3)
/*  13:    */   {
/*  14: 19 */     this.a = paramInt1;
/*  15: 20 */     this.b = paramInt2;
/*  16: 21 */     this.c = paramInt3;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public fd(double paramDouble1, double paramDouble2, double paramDouble3)
/*  20:    */   {
/*  21: 25 */     this(uv.c(paramDouble1), uv.c(paramDouble2), uv.c(paramDouble3));
/*  22:    */   }
/*  23:    */   
/*  24:    */   public boolean equals(Object paramObject)
/*  25:    */   {
/*  26: 30 */     if (this == paramObject) {
/*  27: 31 */       return true;
/*  28:    */     }
/*  29: 33 */     if (!(paramObject instanceof fd)) {
/*  30: 34 */       return false;
/*  31:    */     }
/*  32: 37 */     fd localfd = (fd)paramObject;
/*  33: 39 */     if (n() != localfd.n()) {
/*  34: 40 */       return false;
/*  35:    */     }
/*  36: 42 */     if (o() != localfd.o()) {
/*  37: 43 */       return false;
/*  38:    */     }
/*  39: 45 */     if (p() != localfd.p()) {
/*  40: 46 */       return false;
/*  41:    */     }
/*  42: 49 */     return true;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public int hashCode()
/*  46:    */   {
/*  47: 54 */     return (o() + p() * 31) * 31 + n();
/*  48:    */   }
/*  49:    */   
/*  50:    */   public int g(fd paramfd)
/*  51:    */   {
/*  52: 59 */     if (o() == paramfd.o())
/*  53:    */     {
/*  54: 60 */       if (p() == paramfd.p()) {
/*  55: 61 */         return n() - paramfd.n();
/*  56:    */       }
/*  57: 63 */       return p() - paramfd.p();
/*  58:    */     }
/*  59: 65 */     return o() - paramfd.o();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public int n()
/*  63:    */   {
/*  64: 69 */     return this.a;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int o()
/*  68:    */   {
/*  69: 73 */     return this.b;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public int p()
/*  73:    */   {
/*  74: 77 */     return this.c;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public fd d(fd paramfd)
/*  78:    */   {
/*  79:164 */     return new fd(o() * paramfd.p() - p() * paramfd.o(), p() * paramfd.n() - n() * paramfd.p(), n() * paramfd.o() - o() * paramfd.n());
/*  80:    */   }
/*  81:    */   
/*  82:    */   public double c(double paramDouble1, double paramDouble2, double paramDouble3)
/*  83:    */   {
/*  84:180 */     double d1 = n() - paramDouble1;
/*  85:181 */     double d2 = o() - paramDouble2;
/*  86:182 */     double d3 = p() - paramDouble3;
/*  87:183 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public double d(double paramDouble1, double paramDouble2, double paramDouble3)
/*  91:    */   {
/*  92:187 */     double d1 = n() + 0.5D - paramDouble1;
/*  93:188 */     double d2 = o() + 0.5D - paramDouble2;
/*  94:189 */     double d3 = p() + 0.5D - paramDouble3;
/*  95:190 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public double i(fd paramfd)
/*  99:    */   {
/* 100:194 */     return c(paramfd.n(), paramfd.o(), paramfd.p());
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String toString()
/* 104:    */   {
/* 105:199 */     return Objects.toStringHelper(this).add("x", n()).add("y", o()).add("z", p()).toString();
/* 106:    */   }
/* 107:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     fd
 * JD-Core Version:    0.7.0.1
 */