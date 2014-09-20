/*   1:    */ public class dt
/*   2:    */   extends fd
/*   3:    */ {
/*   4: 13 */   public static final dt a = new dt(0, 0, 0);
/*   5: 15 */   private static final int b = 1 + uv.c(uv.b(30000000));
/*   6: 16 */   private static final int c = b;
/*   7: 17 */   private static final int d = 64 - b - c;
/*   8: 19 */   private static final int f = 0 + c;
/*   9: 20 */   private static final int g = f + d;
/*  10: 21 */   private static final long h = (1L << b) - 1L;
/*  11: 22 */   private static final long i = (1L << d) - 1L;
/*  12: 23 */   private static final long j = (1L << c) - 1L;
/*  13:    */   
/*  14:    */   public dt(int paramInt1, int paramInt2, int paramInt3)
/*  15:    */   {
/*  16: 26 */     super(paramInt1, paramInt2, paramInt3);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public dt(double paramDouble1, double paramDouble2, double paramDouble3)
/*  20:    */   {
/*  21: 30 */     super(paramDouble1, paramDouble2, paramDouble3);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public dt(wv paramwv)
/*  25:    */   {
/*  26: 34 */     this(paramwv.s, paramwv.t, paramwv.u);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public dt(brw parambrw)
/*  30:    */   {
/*  31: 38 */     this(parambrw.a, parambrw.b, parambrw.c);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public dt(fd paramfd)
/*  35:    */   {
/*  36: 42 */     this(paramfd.n(), paramfd.o(), paramfd.p());
/*  37:    */   }
/*  38:    */   
/*  39:    */   public dt a(double paramDouble1, double paramDouble2, double paramDouble3)
/*  40:    */   {
/*  41: 47 */     return new dt(n() + paramDouble1, o() + paramDouble2, p() + paramDouble3);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public dt a(int paramInt1, int paramInt2, int paramInt3)
/*  45:    */   {
/*  46: 52 */     return new dt(n() + paramInt1, o() + paramInt2, p() + paramInt3);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public dt a(fd paramfd)
/*  50:    */   {
/*  51: 57 */     return new dt(n() + paramfd.n(), o() + paramfd.o(), p() + paramfd.p());
/*  52:    */   }
/*  53:    */   
/*  54:    */   public dt b(fd paramfd)
/*  55:    */   {
/*  56: 62 */     return new dt(n() - paramfd.n(), o() - paramfd.o(), p() - paramfd.p());
/*  57:    */   }
/*  58:    */   
/*  59:    */   public dt a(int paramInt)
/*  60:    */   {
/*  61: 67 */     return new dt(n() * paramInt, o() * paramInt, p() * paramInt);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public dt a()
/*  65:    */   {
/*  66: 72 */     return b(1);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public dt b(int paramInt)
/*  70:    */   {
/*  71: 77 */     return a(ej.b, paramInt);
/*  72:    */   }
/*  73:    */   
/*  74:    */   public dt b()
/*  75:    */   {
/*  76: 82 */     return c(1);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public dt c(int paramInt)
/*  80:    */   {
/*  81: 87 */     return a(ej.a, paramInt);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public dt c()
/*  85:    */   {
/*  86: 92 */     return d(1);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public dt d(int paramInt)
/*  90:    */   {
/*  91: 97 */     return a(ej.c, paramInt);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public dt d()
/*  95:    */   {
/*  96:102 */     return e(1);
/*  97:    */   }
/*  98:    */   
/*  99:    */   public dt e(int paramInt)
/* 100:    */   {
/* 101:107 */     return a(ej.d, paramInt);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public dt e()
/* 105:    */   {
/* 106:112 */     return f(1);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public dt f(int paramInt)
/* 110:    */   {
/* 111:117 */     return a(ej.e, paramInt);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public dt f()
/* 115:    */   {
/* 116:122 */     return g(1);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public dt g(int paramInt)
/* 120:    */   {
/* 121:127 */     return a(ej.f, paramInt);
/* 122:    */   }
/* 123:    */   
/* 124:    */   public dt a(ej paramej)
/* 125:    */   {
/* 126:132 */     return a(paramej, 1);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public dt a(ej paramej, int paramInt)
/* 130:    */   {
/* 131:137 */     return new dt(n() + paramej.g() * paramInt, o() + paramej.h() * paramInt, p() + paramej.i() * paramInt);
/* 132:    */   }
/* 133:    */   
/* 134:    */   public dt c(fd paramfd)
/* 135:    */   {
/* 136:150 */     return new dt(o() * paramfd.p() - p() * paramfd.o(), p() * paramfd.n() - n() * paramfd.p(), n() * paramfd.o() - o() * paramfd.n());
/* 137:    */   }
/* 138:    */   
/* 139:    */   public long g()
/* 140:    */   {
/* 141:155 */     return (n() & h) << g | (o() & i) << f | (p() & j) << 0;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public static dt a(long paramLong)
/* 145:    */   {
/* 146:159 */     int k = (int)(paramLong << 64 - g - b >> 64 - b);
/* 147:160 */     int m = (int)(paramLong << 64 - f - d >> 64 - d);
/* 148:161 */     int n = (int)(paramLong << 64 - c >> 64 - c);
/* 149:    */     
/* 150:163 */     return new dt(k, m, n);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public static Iterable a(dt paramdt1, dt paramdt2)
/* 154:    */   {
/* 155:167 */     dt localdt1 = new dt(Math.min(paramdt1.n(), paramdt2.n()), Math.min(paramdt1.o(), paramdt2.o()), Math.min(paramdt1.p(), paramdt2.p()));
/* 156:168 */     dt localdt2 = new dt(Math.max(paramdt1.n(), paramdt2.n()), Math.max(paramdt1.o(), paramdt2.o()), Math.max(paramdt1.p(), paramdt2.p()));
/* 157:    */     
/* 158:170 */     return new du(localdt1, localdt2);
/* 159:    */   }
/* 160:    */   
/* 161:    */   public static Iterable b(dt paramdt1, dt paramdt2)
/* 162:    */   {
/* 163:238 */     dt localdt1 = new dt(Math.min(paramdt1.n(), paramdt2.n()), Math.min(paramdt1.o(), paramdt2.o()), Math.min(paramdt1.p(), paramdt2.p()));
/* 164:239 */     dt localdt2 = new dt(Math.max(paramdt1.n(), paramdt2.n()), Math.max(paramdt1.o(), paramdt2.o()), Math.max(paramdt1.p(), paramdt2.p()));
/* 165:    */     
/* 166:241 */     return new dw(localdt1, localdt2);
/* 167:    */   }
/* 168:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     dt
 * JD-Core Version:    0.7.0.1
 */