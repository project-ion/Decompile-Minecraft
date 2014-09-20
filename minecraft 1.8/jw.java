/*   1:    */ public class jw
/*   2:    */   implements id
/*   3:    */ {
/*   4:    */   private int a;
/*   5:    */   private boolean b;
/*   6:    */   private arc c;
/*   7:    */   private int d;
/*   8:    */   private vt e;
/*   9:    */   private int f;
/*  10:    */   private are g;
/*  11:    */   private boolean h;
/*  12:    */   
/*  13:    */   public jw() {}
/*  14:    */   
/*  15:    */   public jw(int paramInt1, arc paramarc, boolean paramBoolean1, int paramInt2, vt paramvt, int paramInt3, are paramare, boolean paramBoolean2)
/*  16:    */   {
/*  17: 30 */     this.a = paramInt1;
/*  18: 31 */     this.d = paramInt2;
/*  19: 32 */     this.e = paramvt;
/*  20: 33 */     this.c = paramarc;
/*  21: 34 */     this.f = paramInt3;
/*  22: 35 */     this.b = paramBoolean1;
/*  23: 36 */     this.g = paramare;
/*  24: 37 */     this.h = paramBoolean2;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(hd paramhd)
/*  28:    */   {
/*  29: 42 */     this.a = paramhd.readInt();
/*  30:    */     
/*  31: 44 */     int i = paramhd.readUnsignedByte();
/*  32: 45 */     this.b = ((i & 0x8) == 8);
/*  33: 46 */     i &= 0xFFFFFFF7;
/*  34: 47 */     this.c = arc.a(i);
/*  35:    */     
/*  36: 49 */     this.d = paramhd.readByte();
/*  37: 50 */     this.e = vt.a(paramhd.readUnsignedByte());
/*  38: 51 */     this.f = paramhd.readUnsignedByte();
/*  39: 52 */     this.g = are.a(paramhd.c(16));
/*  40: 53 */     if (this.g == null) {
/*  41: 54 */       this.g = are.b;
/*  42:    */     }
/*  43: 56 */     this.h = paramhd.readBoolean();
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void b(hd paramhd)
/*  47:    */   {
/*  48: 61 */     paramhd.writeInt(this.a);
/*  49: 62 */     int i = this.c.a();
/*  50: 63 */     if (this.b) {
/*  51: 64 */       i |= 0x8;
/*  52:    */     }
/*  53: 66 */     paramhd.writeByte(i);
/*  54: 67 */     paramhd.writeByte(this.d);
/*  55: 68 */     paramhd.writeByte(this.e.a());
/*  56: 69 */     paramhd.writeByte(this.f);
/*  57: 70 */     paramhd.a(this.g.a());
/*  58: 71 */     paramhd.writeBoolean(this.h);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void a(ik paramik)
/*  62:    */   {
/*  63: 76 */     paramik.a(this);
/*  64:    */   }
/*  65:    */   
/*  66:    */   public int a()
/*  67:    */   {
/*  68: 80 */     return this.a;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean b()
/*  72:    */   {
/*  73: 84 */     return this.b;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public arc c()
/*  77:    */   {
/*  78: 88 */     return this.c;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public int d()
/*  82:    */   {
/*  83: 92 */     return this.d;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public vt e()
/*  87:    */   {
/*  88: 96 */     return this.e;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public int f()
/*  92:    */   {
/*  93:100 */     return this.f;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public are g()
/*  97:    */   {
/*  98:104 */     return this.g;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public boolean h()
/* 102:    */   {
/* 103:108 */     return this.h;
/* 104:    */   }
/* 105:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     jw
 * JD-Core Version:    0.7.0.1
 */