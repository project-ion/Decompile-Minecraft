/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class cus
/*   7:    */ {
/*   8: 10 */   private static final Logger a = ;
/*   9: 12 */   private final List b = Lists.newArrayList();
/*  10: 13 */   private final List c = Lists.newArrayList();
/*  11: 14 */   private int d = 0;
/*  12: 16 */   private int e = -1;
/*  13: 17 */   private List f = Lists.newArrayList();
/*  14: 18 */   private int g = -1;
/*  15:    */   
/*  16:    */   public cus(cus paramcus)
/*  17:    */   {
/*  18: 21 */     this();
/*  19: 22 */     for (int i = 0; i < paramcus.h(); i++) {
/*  20: 23 */       a(paramcus.c(i));
/*  21:    */     }
/*  22: 25 */     this.d = paramcus.f();
/*  23:    */   }
/*  24:    */   
/*  25:    */   public cus() {}
/*  26:    */   
/*  27:    */   public void a()
/*  28:    */   {
/*  29: 32 */     this.b.clear();
/*  30: 33 */     this.c.clear();
/*  31: 34 */     this.e = -1;
/*  32: 35 */     this.f.clear();
/*  33: 36 */     this.g = -1;
/*  34: 37 */     this.d = 0;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void a(cuu paramcuu)
/*  38:    */   {
/*  39: 41 */     if ((paramcuu.g()) && (i()))
/*  40:    */     {
/*  41: 42 */       a.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
/*  42: 43 */       return;
/*  43:    */     }
/*  44: 46 */     this.b.add(paramcuu);
/*  45: 47 */     this.c.add(Integer.valueOf(this.d));
/*  46: 48 */     paramcuu.a(this.d);
/*  47: 49 */     this.d += paramcuu.f();
/*  48: 51 */     switch (cut.a[paramcuu.c().ordinal()])
/*  49:    */     {
/*  50:    */     case 1: 
/*  51: 53 */       this.g = paramcuu.a();
/*  52: 54 */       break;
/*  53:    */     case 2: 
/*  54: 56 */       this.e = paramcuu.a();
/*  55: 57 */       break;
/*  56:    */     case 3: 
/*  57: 59 */       this.f.add(paramcuu.e(), Integer.valueOf(paramcuu.a()));
/*  58: 60 */       break;
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean b()
/*  63:    */   {
/*  64: 68 */     return this.g >= 0;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int c()
/*  68:    */   {
/*  69: 72 */     return this.g;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public boolean d()
/*  73:    */   {
/*  74: 76 */     return this.e >= 0;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public int e()
/*  78:    */   {
/*  79: 80 */     return this.e;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean a(int paramInt)
/*  83:    */   {
/*  84: 84 */     return this.f.size() - 1 >= paramInt;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public int b(int paramInt)
/*  88:    */   {
/*  89: 88 */     return ((Integer)this.f.get(paramInt)).intValue();
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String toString()
/*  93:    */   {
/*  94: 93 */     String str = "format: " + this.b.size() + " elements: ";
/*  95: 94 */     for (int i = 0; i < this.b.size(); i++)
/*  96:    */     {
/*  97: 95 */       str = str + ((cuu)this.b.get(i)).toString();
/*  98: 96 */       if (i != this.b.size() - 1) {
/*  99: 97 */         str = str + " ";
/* 100:    */       }
/* 101:    */     }
/* 102:100 */     return str;
/* 103:    */   }
/* 104:    */   
/* 105:    */   private boolean i()
/* 106:    */   {
/* 107:104 */     for (cuu localcuu : this.b) {
/* 108:105 */       if (localcuu.g()) {
/* 109:106 */         return true;
/* 110:    */       }
/* 111:    */     }
/* 112:110 */     return false;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public int f()
/* 116:    */   {
/* 117:114 */     return this.d;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public List g()
/* 121:    */   {
/* 122:118 */     return this.b;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public int h()
/* 126:    */   {
/* 127:122 */     return this.b.size();
/* 128:    */   }
/* 129:    */   
/* 130:    */   public cuu c(int paramInt)
/* 131:    */   {
/* 132:126 */     return (cuu)this.b.get(paramInt);
/* 133:    */   }
/* 134:    */   
/* 135:    */   public boolean equals(Object paramObject)
/* 136:    */   {
/* 137:135 */     if (this == paramObject) {
/* 138:136 */       return true;
/* 139:    */     }
/* 140:138 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/* 141:139 */       return false;
/* 142:    */     }
/* 143:142 */     cus localcus = (cus)paramObject;
/* 144:144 */     if (this.d != localcus.d) {
/* 145:145 */       return false;
/* 146:    */     }
/* 147:147 */     if (!this.b.equals(localcus.b)) {
/* 148:148 */       return false;
/* 149:    */     }
/* 150:150 */     if (!this.c.equals(localcus.c)) {
/* 151:151 */       return false;
/* 152:    */     }
/* 153:154 */     return true;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public int hashCode()
/* 157:    */   {
/* 158:159 */     int i = this.b.hashCode();
/* 159:160 */     i = 31 * i + this.c.hashCode();
/* 160:161 */     i = 31 * i + this.d;
/* 161:162 */     return i;
/* 162:    */   }
/* 163:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cus
 * JD-Core Version:    0.7.0.1
 */